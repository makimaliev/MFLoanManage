package kg.gov.mf.loan.manage.repository;

import kg.gov.mf.loan.manage.util.SearchOperation;
import kg.gov.mf.loan.manage.util.SpecSearchCriteria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

import java.util.*;

public final class EntitySpecificationsBuilder<E> {

    private final List<SpecSearchCriteria> params;

    public EntitySpecificationsBuilder() {
        params = new ArrayList<>();
    }

    // API

    public final EntitySpecificationsBuilder with(final String key, final String operation, final Object value, final String prefix, final String suffix) {
        return with(null, key, operation, value, prefix, suffix);
    }

    public final EntitySpecificationsBuilder with(final String orPredicate, final String key, final String operation, final Object value, final String prefix, final String suffix) {
        SearchOperation op = SearchOperation.getSimpleOperation(operation.charAt(0));
        if (op != null) {
            if (op == SearchOperation.EQUALITY) { // the operation may be complex operation
                final boolean startWithAsterisk = prefix != null && prefix.contains(SearchOperation.ZERO_OR_MORE_REGEX);
                final boolean endWithAsterisk = suffix != null && suffix.contains(SearchOperation.ZERO_OR_MORE_REGEX);

                if (startWithAsterisk && endWithAsterisk) {
                    op = SearchOperation.CONTAINS;
                } else if (startWithAsterisk) {
                    op = SearchOperation.ENDS_WITH;
                } else if (endWithAsterisk) {
                    op = SearchOperation.STARTS_WITH;
                }
            }
            params.add(new SpecSearchCriteria(orPredicate, key, op, value));
        }
        return this;
    }

    public Specification<E> build() {

        if (params.size() == 0)
            return null;

        Specification<E> result = new EntitySpecification<E>(params.get(0));

        for (int i = 1; i < params.size(); i++) {
            result = params.get(i)
                    .isOrPredicate()
                    ? Specifications.where(result)
                    .or(new EntitySpecification<E>(params.get(i)))
                    : Specifications.where(result)
                    .and(new EntitySpecification<E>(params.get(i)));

        }

        return result;
    }

    public final EntitySpecificationsBuilder with(EntitySpecification spec) {
        params.add(spec.getCriteria());
        return this;
    }

    public final EntitySpecificationsBuilder with(SpecSearchCriteria criteria) {
        params.add(criteria);
        return this;
    }

}
