package com.example.library_api.service;

import com.example.library_api.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
    Member findById(Long id);
    Member save(Member member);
    void delete(Long id);
}