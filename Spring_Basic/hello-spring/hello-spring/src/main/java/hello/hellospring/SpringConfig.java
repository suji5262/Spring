package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    } // 위와 같이 연결 시킴

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    } // 인터페이스는 new 가 안됨
}
