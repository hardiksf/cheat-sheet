# Regular expressions

## Literal characters
- `/a/` matches 'a'
- `/abc/` matches 'abc'

## Wildcard metacharacters
`.` any character except new line  

- `/h.t/` matches 'hot', 'hat', 'hit', 'h.t'.

## Escaping metacharacters
`\` escapes next character   

- *ONLY* for escaping metacharacters
- Literal characters should *NEVER* be escaped
- Quotation marks are not metacharacters and don't need to be escaped
- `/10\.00/` matches 10.00 (escaped `.`)

## Other special characters
character | regex
--- | ---
space | type space
tab | \t
line returns | \r, \n, \r\n
return | \r
new line | \n
ASCII or ANSI code (eg. 0xA9) | \xA9

## A character set
`[` begins a character set  
`]` ends a character set

- *ONLY* one character
- Order does not matter
- `/[aeiou]/` matches any one vowel
- `/gr[ae]y/` matches 'grey' & 'gray'
- `/gr[ea]t/` does *NOT* match great


## Character ranges
`-` range of characters

- `/[0-9]\` matches 0 to 9
- `/[A-Za-z]/` matches alphabets
- `/[50-99]/` does *NOT* match 50 to 99. It same as `/[0-9]/`. `/[50-99]/` means match either of these:
	- `5`
	- `0-9`
	- `9`

## Negative character sets
`^` negates a character set  

- `/[^aeiou]/` matches any character that is non-vowel
- `/see[^mn]/` matches 'seek' and 'sees', but does *NOT* match 'seem' or 'seen'.
- `/[^a-z]/` matches any character that is not a-z

## Metacharacters inside character sets
Most metacharacter does not need to be escaped inside character sets

- `/h[abc.xyz]t/` matches 'hat' and 'h.t', but not 'hot'. 
- If you escape its fine, but its not needed. `/h[abc\.xyz]t/` would do the same as above.

`] - ^ \` metacharacters need to be escaped in character sets

- `var[([][0-9][)\]]` matches 'var(3)' and 'var[4]'
- `[([]` for '(' or '['
- `[0-9]` for a number
- `[)\]]` for ')' or ']'. ']' needed to escape here

## Shorthand character sets
Shorthand | Meaning | Equivalent
--- | --- | --- |
`/\d/` | digit | `/[0-9]/`
`/\w/` | word character | `/[a-zA-Z0-9_]/` notice underscore `_`
`/\s/` | whitespace | `/[ \t\r\r]/` notice space ` `
`/\D/` | not digit | `/[^0-9]/`
`/\W/` | not word character | `/[^a-zA-Z0-9_]/`
`/\S/` | not whitespace | `/[^ \t\r\r]/`

## Repetition metacharacters
`*` preceding item zero or more times  
`+` preceding item one or more times - only scenario where item must exist  
`?` preceding item zero or one time  

- `/apples*/` matches 'apple', 'apples' and 'applesss'
- `/apples+/` matches 'apples' and 'applesss', but *NOT* 'apple'
- `/apples?/` matches 'apple' and 'apples, but *NOT* 'applesss'

## Quantified repetition
`{` starts quantified repetition of preceding item  
`}` ends quantified repetition of preceding item 
 
- `{min, max}`
	- min and max are positive numbers
	- min must *ALWAYS* be included, can be zero
	- max is optional
	- `,` is optional

- `/\d{4,8}/` matches numbers with four to eight digits
- `/\d{4}/` matches numbers with exactly four digits
- `/\d{4, }/` matches numbers with four or more digits

## Lazy expressions
`?` makes preceding character lazy.   
Matches as little as possible

Syntax:  
`*?` `+?` `{min,max}?` `??`  

- `/apples??/` first `?` means `s` can occur zero or one time. Second `?` means take `s` zero times. So it matches `apple`

## Grouping metacharacters
`(` starts grouped expression  
`)` ends grouped expression  

- `/(abc)+/` matches 'abc' and 'abcabc` and ..
- `/(in)?dependent/` matches 'independent' and 'dependent'

## Alternation metacharacters
`|` matches previous or next expression  
Ordered, leftmost expression gets precedence  
Multiple choices can be daisy-chained

- `/apple|orange/` matches 'apple' and 'orange`
