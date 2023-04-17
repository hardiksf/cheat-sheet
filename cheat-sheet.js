/************************************
 ***************** STRING
 * 
 *************************************/
//replaceAll() is faster than replace()
{
    const doc = "Text toges here";
    console.time(`1`);
    //replace all characters except alphanumeric and space
    const replacedString = doc.replace(/[^a-zA-Z0-9 ]/g, '');
    console.timeEnd(`1`);

    String.prototype.replaceAll = function (search, replacement) {
        return this.replace(new RegExp(search, 'g'), replacement);
    };

    console.time(`2`);
    doc.replaceAll(/[^a-zA-Z0-9 ]/g, '');
    console.timeEnd(`2`);

    //running time
    // 1: 0.252ms
    // 2: 0.079ms

    // 1: 0.205ms
    // 2: 0.077ms

    // 1: 0.170ms
    // 2: 0.092ms
}

// Unique characters in string
String.prototype.concat(...new Set(string))


/************************************
 ***************** MAP
 * 
 *************************************/
// each value in map
const map = new Map();
const mapIterator = map.values();
for (let index = 0; index < map.size; index++) {
    //do something
}

// Get unique (distinct) element from Arr

/************************************
 ***************** ARRAY
 * 
 *************************************/
// Get unique (distinct) element from Array using Set
const uniqueNumbersSet = new Set(myArray);
const uniqueNumbersArray = Array.from(new Set(myArray));

// removes the last element from an array and returns that element
uniqueNumbersArray.pop();

//  removes the first element from an array and returns that removed element
uniqueNumbersArray.shift();

// dds one or more elements to the beginning of an array and returns the new length of the array
uniqueNumbersArray.unshift();

// adds one or more elements to the end of an array and returns the new length of the array.
uniqueNumbersArray.push();

// merge two or more arrays. This method does not change the existing arrays, but instead returns a new array. 
{
    var array1 = ['a', 'b', 'c'];
    var array2 = ['d', 'e', 'f'];

    console.log(array1.concat(array2));
    // expected output: Array ["a", "b", "c", "d", "e", "f"]
}

// splice
{
    var myFish = ['angel', 'clown', 'drum', 'mandarin', 'sturgeon'];
    var removed = myFish.splice(3, 1);

    // removed is ["mandarin"]
    // myFish is ["angel", "clown", "drum", "sturgeon"]
} {
    var myFish = ['angel', 'clown', 'drum', 'sturgeon'];
    var removed = myFish.splice(2, 1, 'trumpet');

    // myFish is ["angel", "clown", "trumpet", "sturgeon"]
    // removed is ["drum"]
}


// Max of an Array
Math.max(...myArray);

// Sort number array
// Array.sort() sorts for string. that is why we can not use Array.sort() for sorting number. instead, 
arr.sort((a, b) => a - b);

//Array contains
var array1 = [1, 2, 3];
console.log(array1.includes(2));
// expected output: true

//Declare array with size
myArray = new int[10];

// Pre-fill array 
// Pre-filling it with 0 here
Array.from(Array(myArray.length), () => 0);

//Reverse integer
let number = 123;
number = number + "";
let reverseNumber = parseInt(number.split("").reverse().join(""));

// Integer to binary
{
    const N = 12345;
    const binaryNumber = N.toString(2);
}

// Binary to integer
{
    const binaryNumber = 00000111010101010;
    parseInt(binaryNumber.join(""), 2);
}


// Repeat a character in times. Repeats '*' 10 times.
{
    '*'.repeat(10);
}


//Create alphabets
//65 is ASCI code for A and 90 for Z
//97 to 122 for a-z
for (let i = 65; i <= 90; i++) {
    console.log(String.fromCharCode(i));
}

/************************************
 ***************** REGEX, regular expression
 * 
 *************************************/
/*
 * --- Directions
 * Write a function that returns the number of vowels
 * used in a string.  Vowels are the characters 'a', 'e'
 * 'i', 'o', and 'u'.
 * --- Examples
 *   vowels('Hi There!') --> 3
 *   vowels('Why do you ask?') --> 4
 *   vowels('Why?') --> 0
 */
const vowelsRegex = string => {
    const listOfVowels = string.match(/[aeiou]/gi); // g-> don't stop at first occurrence, i-> ignore case
    if (listOfVowels) {//listOfVowels is an array. Incase if there is no match, it would be null. That is why we have this if condition. In case of no match, we cant have length of null
        return listOfVowels.length;
    } else {
        return 0;
    }
};
