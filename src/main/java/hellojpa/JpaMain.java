package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
//
//            em.persist(member);
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(5)
//                    .getResultList();

//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

            // 비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");

            // 영속
//            System.out.println("=== BEFORE ===");
//            em.persist(member);
//            System.out.println("=== AFTER ===");

//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);

//            System.out.println("result = " + (findMember1 == findMember2));

//            Member member = new Member(200L, "member200");
//            em.persist(member);
//
//            em.flush();
//
//            System.out.println("=========");

            Member member1 = new Member();
            member1.setUsername("A");
            Member member2 = new Member();
            member2.setUsername("B");
            Member member3 = new Member();
            member3.setUsername("C");

            System.out.println("==============");
            em.persist(member1);
            em.persist(member2);
            em.persist(member3);
            System.out.println("member = " + member1.getId());
            System.out.println("member = " + member2.getId());
            System.out.println("member = " + member3.getId());
            System.out.println("==============");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}