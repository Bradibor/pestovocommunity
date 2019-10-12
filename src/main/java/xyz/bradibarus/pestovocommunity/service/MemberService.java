package xyz.bradibarus.pestovocommunity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import xyz.bradibarus.pestovocommunity.model.Member;
import xyz.bradibarus.pestovocommunity.repository.MemberRepository;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public Page<Member> getMembers(Example<Member> example, PageRequest pageRequest) {
        return memberRepository.findAll(example, pageRequest);
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
