package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Member findMember(Long memberId) {
        return null;
    }

    @Override
    public void join(Member member) {

    }
}
