 class Array {
    public static void main(String[] args) //throws IOException
    {
        int[] array ; //referencing the the array we are about to create
         array = new int[100]; // creating a new object 
         int j; //loop counter
         int k;
         int numberOfElem = 0; // capacity in the array
         int searchKey; // used in search for specific elems of the array
         // To insert elements:
         array[0] = 34;
         array[1] = 31;
         array[2] = 45;
         array[3] = 54;
         array[4] = 76;
         numberOfElem = 5;
         for(j = 0; j<numberOfElem; j++)
            System.out.print(array[j]+"");
         System.out.println("");
         searchKey = 54; // find item with key 66
 for(j=0; j<numberOfElem; j++) // for each element,
 if(array[j] == searchKey) // found item?
 break; // yes, exit before end
 //if(j == numberOfElem) // at the end?
 //System.out.println("Can't find " + searchKey); // yes
 else
 System.out.println("Found " + searchKey);
 //searchKey = 45; // delete item with key 55
 //for(j=0; j<numberOfElem; j++) // look for it
 //if(array[j] == searchKey)
 //break;
 //for(int k=j; k<numberOfElem; k++) // move higher ones downs

 //array[k] = array[k+1];
 //numberOfElem--; 
 searchKey = 45;
 for(j=0; j< numberOfElem; j++)
     if(array[j] == searchKey)
         break;
 else
         System.out.println("Found" + searchKey);
         
    }
            
            }
