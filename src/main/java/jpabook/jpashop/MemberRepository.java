package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

//repository란 Entity 같은걸 찾아주는 것(DAO와 비슷)
@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId(); //쿼리와 커맨드 분리
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
