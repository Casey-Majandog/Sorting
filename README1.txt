How to run program:
1. Open the command prompt

2. Go to the file where the sort.jar file is located

3. Right click sort.jar and select Properties

4. Copy the location path

5. Go back to the command prompt and change directories to the location path of the sort.jar file
EXAMPLE:
C:\Users>cd [PASTE LOCATION]

6. After you change directories, type in the following:
C:\Users\desktop\Assignment2>java -jar sort.jar

DO NOT PRESS ENTER YET

7.Below is an example of input that can be entered to run the program:
C:\Users\desktop\Assignment2>java -jar sort.jar -fpolyfor1.txt -Tv -Sb

This will choose the file polyfor1.txt, use the data type volume and use bubble sort to organize the data type values.

Other valid inputs:

C:\Users\desktop\Assignment2>java -jar sort.jar -tv -SB -fpolyfor1.txt
C:\Users\desktop\Assignment2>java -jar sort.jar -sB -Fpolyfor1.txt -TV

KEY:
-F[FILENAME.txt]
-T[DATA TYPE]
-S[SORT TYPE]

FILENAME.txt:
-polyfor1.txt
-polyfor3.txt
-polyfor5.txt

DATA TYPE:
-h (Height)
-a (base area)
-v (volume)

SORT TYPE:
-b (Bubble)
-s (Selection)
-i (Insertion)
-m (Merge)
-q (Quick)
-z (Cocktail)





