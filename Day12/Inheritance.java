

class Student extends Person{
	private int[] testScores;
     Student(String firstname, String Lastname, int id,int [] Scores)
     {
          super(firstname, Lastname , id);
        this.testScores = Scores;
        }
        public String calculate()
          {
              int a = 0;
              for(int i : this.testScores)
              {
                a+=i;
              }
               a=a/testScores.length;
                if(40<=a && 55>a)
                {
                    return "D";
                }
                else if(55<=a && 70>a)
                {
                    return"P";
                }
                else if(70<=a && 80>a)
                {
                    return"A";
                }
                else if(80<=a && 90>a)
                {
                    return"E";
                }
                else if(90<=a && 100>=a)
                {
                    return"O";
                }
                else
                {
                    return "T";
                }
   }
}
