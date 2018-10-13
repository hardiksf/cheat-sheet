/************************************
 ***************** STRING
 * 
 *************************************/
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