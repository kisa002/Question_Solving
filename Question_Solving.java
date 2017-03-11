import java.util.Scanner;

public class Question_Solving
{
   static Scanner sc = new Scanner(System.in);

   static int question[] = new int[90];
   static int answer[] = new int[90];

   static double score1 = 0, score2 = 0;
   static double result = 0;

   public static void main(String[] args)
   {
      output("개발자 : 유광무\n\n쓸모없는 리눅스 마스터 2급 2차 문제 풀이\n\n1과목 시작\n");

      for(int i=1; i<=48; i++)
      {
         output(i + "번 : ");
         question[i] = input();
      }

     output("\n\n2과목 시작\n");

     for(int i=49; i<=80; i++)
     {
        output(i + "번 : ");
        question[i] = input();
     }

     output("\n\n시험 완료\n\n정답 입력\n\n");

     for(int i=1; i<=48; i++)
     {
        output(i + "번 : ");
        answer[i] = input();

        if(question[i] == answer[i])
        {
           score1 += 1.5;
        }
     }

     for(int i=49; i<=80; i++)
     {
        output(i + "번 : ");
        answer[i] = input();

        if(question[i] == answer[i])
        {
           score2 += 1.5;
        }
     }

     output("\n정답 입력 완료\n\n채점 결과\n\n");

     for(int i=1; i<=80; i++)
     {
        output(i + "번 : " + question[i] + " / " + answer[i]);
     }

     result = score1 + score2;

     if(score1 + score2 >= 80.0)
        output("\n\n합격!\n\n1과목 : " + score1 + "점\n2과목 : " + score2 + "\n\n최종 : " + result + "점");
     else
        output("\n\n불합격!\n\n1과목 : " + score1 + "점\n2과목 : " + score2 + "\n\n최종 : " + result + "점\n\n합격을 위해서는 " + (60.0 - result) / 1.25 + "문제를 추가로 맞추셨어야 합니다.");

   }

   public static int input()
   {
      return sc.nextInt();
   }

   public static void output(String text)
   {
      System.out.println(text);
   }
}
