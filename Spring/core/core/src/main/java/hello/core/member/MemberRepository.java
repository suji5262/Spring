package hello.core.member;

public interface MemberRepository { // 회원 저장소

    void save(Member member); // 저장

    Member findById(Long memberId); // 회원의 id로 찾는 기능
}
