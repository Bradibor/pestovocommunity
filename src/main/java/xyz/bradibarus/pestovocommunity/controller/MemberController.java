package xyz.bradibarus.pestovocommunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.bradibarus.pestovocommunity.model.Member;
import xyz.bradibarus.pestovocommunity.service.MemberService;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String home() {
        return "redirect:/getMembers";
    }

    @GetMapping("/addMember")
    public String addMember(Model model) {
        model.addAttribute("member", new Member());
        return "form";
    }

    @PostMapping("/addMember")
    public String addMemberAction(Member member) {
        memberService.addMember(member);
        return "form";
    }

    @GetMapping("/getMembers")
    public String getMembers(Model model) {
        model.addAttribute("members", memberService.getMembers());
        return "list";
    }

    @GetMapping("/deleteMember/{memberId}")
    public String deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
        return "redirect:/getMembers";
    }
}