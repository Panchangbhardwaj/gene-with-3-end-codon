
/**
 * Write a description of PART2_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PART2_2 {
    public int ctgcount(String dna)
    {   int end = 0;
        int ctgnum = 0;
        while(true)
        {
         if((dna.indexOf("CTG",end)) != -1)
         {
             
             ctgnum ++;
             end = dna.indexOf("CTG",end) + 3;
            
        }
        else
        {
            break ;
        }
        
    }
    return ctgnum;
}
    public void test()
    {
        String totest;
        totest = "AATGCTAACTAGCTGACTAAT";
        int ans = ctgcount(totest);
        System.out.println(ans);
    }
}



