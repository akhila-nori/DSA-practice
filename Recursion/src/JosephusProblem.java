public class JosephusProblem {
    public static void main(String[] args) {

    }

    static int josephus(int n, int k) {
        if (n == 1) return 0; //only 1 person left, his index = 0
        return (josephus(n - 1, k) + k) % n;  //everytime 1 person drops in each round . therefore we have (n-1) people left recursive call
        //PATTERN - Old Name = (New Name + k)


        //Question 1)  How do you know the + k goes outside the function? Think of it like this:
        //  The Function Call (josephus(n-1, k)): This is a request you send to a sub-worker. You are saying, "Hey, tell me who wins a game of n-1 people."
        // The Result: The sub-worker gives you a number (let's say they say "The winner is chair 0").
        // The Post-Processing (+ k): You cannot add k before you get that number back. The sub-worker's answer is in "New Circle" coordinates. Your job as the parent function is to translate their answer into "Old Circle" coordinates.

        //Question 2 ) Why we add k ?
        // because the "starting line" moved 'k' steps forward when we eliminated the first person.If your friend says, "In the new small circle, the winner is at position 0," you know that in your original big circle, that person was actually 'K' steps further ahead. By adding 'k', you are "un-shifting" the index to find their original chair number.

        //Question 3 ) why are you not adding k+k inside the paranthesis ?
        // If you call josephus(n-1, k + k), you are telling the sub-worker: "Hey, run a game where you skip double the people every time." * That's a completely different game! You want the sub-worker to use the same skip value (k), but you just want to adjust their final answer.

        //Question 4) %n why ??
        //When you add +k to get back original ordinates of the circle , you move exceed circle capacity --> %n --> brings back number count within circle.

    }
}
   // In this problem, "winner" is the result returned by the recursive function call josephus(n-1, k).

  //If index counting starts at 1 : (josephus(n-1, k) - 1) This takes the 1-based name (like 1, 2, or 3) and subtracts 1 to turn it into a 0-based index (like 0, 1, or 2). Now the computer can handle it.
