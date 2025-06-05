package com.jungyeons.springintroductory.repository;

import com.jungyeons.springintroductory.domain.Member;
import com.jungyeons.springintroductory.service.MemberService;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepositiry implements MemberRepository {
    private final EntityManager em;

    public JpaMemberRepositiry(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        //엔티티 매니저를 사용해서 엔티티를 영속성 컨텍스트에 저장
         em.persist(member);
         return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        //Member 엔티티를 조회한다.
         Member member = em.find(Member.class, id);
         return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class).setParameter("name", name).getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        List<Member> result= em.createQuery("select m from Member m").getResultList();
        return result;
    }

    @Override
    public void clearStore() {

    }
}
