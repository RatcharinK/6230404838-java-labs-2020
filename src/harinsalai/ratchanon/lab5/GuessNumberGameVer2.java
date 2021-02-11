package harinsalai.ratchanon.lab5;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {

    protected int[] guesses;
    protected static int numGuesses = 0;
    protected static int MAX_GUSSES = 20;

    public GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUSSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUSSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUSSES];
    }


    @Override
    public void playGame() {
        super.playGame();
    }

    public void showGuesses() {
        for (int i = 0; i < numGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println(" ");
    }

    public void showSpecific() {
        System.out.println("Enter which guess in the range (1-" + numGuesses + ")");
        int guessnumber = scan.nextInt();
        System.out.println("Guess number " + guessnumber + " is " + guesses[guessnumber - 1]);
    }

    public void playGames() {
        //create boolean for restartable
        boolean countinueplay = true;
        //start for guessing
        boolean wingame = false;

        //Loop
        while (countinueplay == true) {
            int tried = 0;

            while (wingame == false) {
                System.out.print("Please enter a guess (" + minNum + " - " + maxNum + "):");
                int guess = scan.nextInt();
                //out of answer range
                if (guess < minNum || guess > maxNum) {
                    System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                } else if (guess > minNum || guess < maxNum) {
                    guesses[numGuesses] = guess;
                    numGuesses += 1;
                    //correct answer
                    if (guess == correctNum) {
                        System.out.println("Congratulations ! That's correct");
                        wingame = true;
                    }
                    //incorrect answer
                    else if (guess > correctNum) {
                        tried++;
                        System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - tried));
                    } else if (guess < correctNum) {
                        tried++;
                        System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - tried));
                    }
                }
                //out of tries
                if (maxTries == tried) {
                    break;
                }
            }

            boolean exitgame = false;
            //loop for ask if want to continue
            while (exitgame == false) {
                System.out.println("If want to play again type 'y' to continue or 'q' to quit:" +
                        "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play ");
                String restartgame = scan.next().toLowerCase();
                if (restartgame.equals("y")) {
                    wingame = false; //return to false for win a game statement
                    numGuesses = 0;
                    guesses = null; //make array empty
                    guesses = new int[MAX_GUSSES];
                    playGames();
                }

                else if (restartgame.equals("q")) {
                    countinueplay = false;
                    break;
                }

                else if (restartgame.equals("a")) {
                    showGuesses();
                }

                else if (restartgame.equals("g")) {
                    showSpecific();
                }
            }
        }
    }

    public static void main(String[] args) {
        //testConstructors();
        //testSetterGetterMethods();
        testPlayGames();
    }

    public static void testPlayGames() {
        GuessNumberGameVer2 gng = new GuessNumberGameVer2(5, 10, 4);
        gng.playGames();
    }
}
