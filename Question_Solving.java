import java.util.Scanner;

public class Question_Solving
{
   static Scanner sc = new Scanner(System.in);

   static int question[] = new int[130];
   static int answer[] = new int[130];

   static int answerCount, max;

   static double score = 0;
   static double answerScore = 0;

   public static void main(String[] args)
   {
      output("간단한 시험 테스트\n\n1. 문제 갯수 입력\n2. 문제 당 점수 : \n3. 문제푼 답 입력\n4. 정답 입력\n5. 결과 발표\n\n");

      output("1 : 시험볼 문제의 갯수를 입력하세요 : ");
      max = input();

      output("2 : 문제 당 점수를 입력하세요 : ");
      answerScore = inputD();

      output("3 : 푼 문제의 답을 입력하세요.\n");

      for(int i=1; i<=max; i++)
      {
         output(i + "번 : ");
         question[i] = input();
      }

      output("\n\n시험 완료\n\n정답 입력\n\n");

      for(int i=1; i<=max; i++)
      {
         output(i + "번 : ");
         answer[i] = input();

         if(question[i] == answer[i])
         {
            score += answerScore;
            answerCount += 1;
         }
      }

      output("\n정답 입력 완료\n\n채점 결과\n\n");

      for(int i=1; i<=max; i++)
      {
         output(i + "번 : " + question[i] + " / " + answer[i]);
      }

      output("당신은 " + max + "문제중 " + answerCount + "문제를 맞추셨습니다.\n점수는 " + score + "입니다.");

   }

   public static int input()
   {
      return sc.nextInt();
   }

   public static double inputD()
   {
      return sc.nextDouble();
   }

   public static void output(String text)
   {
      System.out.println(text);
   }
}
