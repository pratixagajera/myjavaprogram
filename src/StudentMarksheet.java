public class StudentMarksheet
{
    static StudentMarksheet studentMarksheet = new StudentMarksheet();

    int total;


   public static void main (String [] args)
   {

    studentMarksheet.total(34, 75,92);
   }

   void total(int maths, int sci, int eng)
   {
       System.out.println("Total marks of Maths, Science & English " +" = " +(+maths+ +sci+ +eng));
   }


}
