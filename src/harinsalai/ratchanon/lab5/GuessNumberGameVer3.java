package harinsalai.ratchanon.lab5;

public class GuessNumberGameVer3 extends GuessNumberGameVer2 {

    protected int[] guesses;
    protected static int numGuesses = 0;
    protected static int MAX_GUESSES = 20;

    public GuessNumberGameVer3() {
        super();
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
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

    public void guessAverage() {
        float summation = 0;
        for (int i = 0; i < numGuesses; i++) {
            summation += guesses[i];
        }
        float average = summation/numGuesses;
        System.out.println("Average = "+average);
    }
    public void guessMin() {
        int min = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i] < min){
                min = guesses[i];
            }
        }
        System.out.println("Min = "+ min);
    }
    public void guessMax() {
        int max = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i]> max){
                max = guesses[i];
            }
        }
        System.out.println("Max = "+ max);
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
                        "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play " +
                        "\nType 'v' to see average of 'm' to see minimum or 'x' to see maximum of all your guesses");
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

                else if (restartgame.equals("v")) {
                    guessAverage();
                }

                else if (restartgame.equals("m")) {
                    guessMin();
                }

                else if (restartgame.equals("x")) {
                    guessMax();
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
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(5, 10, 4);
        gng.playGames();
    }
}


