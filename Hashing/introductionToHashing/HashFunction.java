package introductionToHashing;

public class HashFunction {
	/*Hash Function: H(n)=n%size
	 * */
	int hashTable[];
	int size;
	public HashFunction(int size)
	{
		this.size=size;
		hashTable=new int[this.size];
	}
	
	public void insert(int value)
	{
		hashTable[value%size]=value;
		System.out.println(value +" inserted at "+value%size);
	}
	
	public boolean search(int value)
	{
		return hashTable[value%size]!=0;
	}
	
	
	
	public  void printHashTable()
	{
		System.out.println("Hash Table: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(hashTable[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		HashFunction hash=new HashFunction(12);
		hash.insert(112);
		hash.insert(10);
		hash.insert(342);
		hash.insert(14);
		hash.insert(11);
		hash.insert(543);
		hash.insert(111);
		hash.insert(39);
		System.out.println(hash.search(10));
		hash.printHashTable();
		
	}

}
