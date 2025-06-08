package com.jungyeons.springintroductory.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
