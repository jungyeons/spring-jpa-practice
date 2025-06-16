package com.jungyeons.springintroductory.member;


public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
