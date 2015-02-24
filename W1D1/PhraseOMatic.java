public class PhraseOMatic{
	public static void main(String[] args){
		String[] wordListOne = {"Kevin", "Niloofar", "Tosha", "Charlie", "Stella", "Michael"};
		
		String[] wordListTwo = {"mad", "funny", "sad", "crazy", "cute", "dumb", "strong"};
		
		String[] wordListThree = {"chicken", "dog", "hippopotamus", "horse", "unicorn", "Tiger"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " is a " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println(phrase);
	}
}