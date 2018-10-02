`touch`

- `$ touch hello.sh`
- `touch1 command updates times stamp of file if it existing. If not, it creates new file
- extension `.sh` is optional

`echo`

- `echo` command prints to the display
- `echo Hello World!`

`bash`

- `$ bash hello.sh`
- `bash` opens the script and invokes commands in it
- files don't have execute permission by default. That is why we need to type `bash` to execute script

`chmod`

- `chmod 755 hello.sh` Gives everyone permission to read and execute, but only owner can write it

`$ ./hello.sh`

- executes script 'hello.sh'
- Linux looks for command on directory and not on the file. That is why we have to type `./` 