
class Calculator{
    int power(int n , int p) throws Exception{
        double a = Math.pow((double)n,(double)p);
        if(n<0 || p<0)
        {
            throw new Exception("n and p should be non-negative");
        }

        return (int)a;
    }
}
//Write your code here
