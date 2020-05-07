//panchang bhardwaj

import java.util.Arrays;
import edu.duke.*;

public class WHILEL {
    static int end ;
    public int endfinder(int end1,int end2,int end3)
    {
      int[] a = new int[3];
      a[0] = end1;
      a[1] = end2;
      a[2] = end3;
      Arrays.sort(a);
      if(a[2] == -1)
      {return -1;
      }
      else if(a[1] == -1)
      {
         return a[2]; 
        }
        else if(a[0] == -1)
        {   return a[1];
            
        }
        else
        {   return a[0];
        }
     }
    public int endc(String dna,int start)
    {
        int end1 = dna.indexOf("TAA",start+3);
        int end2 = dna.indexOf("TGA",start+3);
        int end3 = dna.indexOf("TAG",start+3);
        int result = endfinder(end1,end2,end3);
        return result;
    }
    public StorageResource findgene(String dna ,int searchfrom)
    {
        StorageResource sr = new StorageResource();
        int start = dna.indexOf("ATG",searchfrom);
        if(start == -1)
        {
            return sr;
        }
        
        end  = endc(dna,start);
        while(end != -1)
        {  
            int length = end - start ;
            if(length%3 == 0)
            {
                sr.add(dna.substring(start,end + 3));
            }
            else 
            {
                end = endc(dna,end+1); 
            }
            
        }
        return sr;
        
    }
    public int numofgene(String dna)
    {
        int num =0;
        int searchfrom = 0;
        int flag = -1;
        do
        {   
            if(findgene(dna,searchfrom) == null)
            {
                flag = 0;
            }
            else {
                  num++;
                  searchfrom = end + 3;
        }
        }while(flag != 0);
        return num ;
    }
    public void  findg(String dna)
    {
        int searchfrom = 0;
        int flag = -1;
        StorageResource sr = findgene(dna,searchfrom);
        do
            {   
            if(findgene(dna,searchfrom) == null)
            {
                flag = 0;
            }
            else {
                  for(String s : sr.data())
                  {
                      System.out.println(s);
                    }
                      searchfrom = end + 3;
                }
        }while(flag != 0);
        
    }
    public void test()
    {
        String totest;
        totest = "AATGCTAACTAGCTGACTAAT";
        findg(totest);
        System.out.println(numofgene(totest));
    }
}
