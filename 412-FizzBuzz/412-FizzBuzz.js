/**
 * @param {number} n
 * @return {string[]}
 */

// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

var fizzBuzz = function(n) {

    let box = [];

    
    for(var i=1; i<=n; i++){

        if(i%3 == 0 && i%5 == 0){
            box.push("FizzBuzz");
            continue;

        }
        if(i%3 == 0){
            box.push("Fizz");
            continue;
        }
        if(i%5 == 0){
            box.push("Buzz");
            continue;

        }        
        else{
            box.push(i.toString());
        }
    }

    return(box);
    
};

fizzBuzz(15);
