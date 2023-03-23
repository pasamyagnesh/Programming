

public class foreach {
    public static void main(String[] args)
    {
        int[] age = { 10,45,23,88,40};
        int elderPeerson= maxAge(age); 
        System.out.println("Max age =" + elderPeerson);
    }
    public static int maxAge(int[] ageClone)
    {
        int letmaxAge = ageClone[0];
        for( int num : ageClone)
        {
            if (num >letmaxAge)
            {
                letmaxAge= num;
            }
        }
        return letmaxAge;
    }
}
