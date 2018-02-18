/**
 * This class defines a cube function by
 * summing 1 more than the multiples of
 * the number 6 which happens to equal x^3.
 */

def cubedBySumming(numOfTerms){//define method
  //Equation
   def result = 0//define variable

  for(def i=1;i<numOfTerms+1;i++) {//define loop variable
      /**
       * herein lies the magic.  Why would one more than
       * the multiples of 6 have anything to do with the cube of a number?
       * */
      result += (1 + 6 * (sum(i)))//sum this computation
  }
  result//return
}//end method

def sum(n){//define method
    def result = 0//define variable

    for(def i=0;i<n;i++){//define loop variable
        result += i//sum this counter
    }
    result//return
}//end method
//this is an edit...something is changing....
def tester = javax.swing.JOptionPane.showInputDialog(
  "Enter an integer bewteen 0..9"
  )
int num = Integer.parseInt("$tester")
assert cubedBySumming(num) == num**3
println "The cube of $tester is " + cubedBySumming(num)
