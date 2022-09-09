package hello.hellospring.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memeberRepoistory = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memeberRepoistory.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memeberRepoistory.findById(memberId);
    }
}
