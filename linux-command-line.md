## Keyboard shortcuts
- ` tab` autocompletes. Type 'cd Des' and press 'tab' it will autocomplete to 'cd Desktop/' as long as there is no other folder's name starting with 'Des'. If it does, it will do nothing. When you press 'tab' again, it will show the list of folders starting with 'Des'
- `Ctr A(^A)` move to beginning line
- `Ctr E` move to end of line
- `optionKey  left arrow` move backward one word at a time
- ` optionKey right arrow` move ahead one word at a time
- `Ctr U` delete from cursor to start
- `Ctr K` delete from cursor to end 
- `Ctr R` search command history
- `Ctr C` cancel command
- `f` go forward. When viewing some contain which is bigger than size of terminal window, we see `:` in bottom left. Typing `f` will move forward
- `b` move backward

## Help
- `man` followed by a command gives manual. eg. `man ls`
- `apropos` if you don't know name of the command you need help with typing `apropos` followed by 'phrase' that you are looking for will give you result that match that phrase. eg. `apropos "list"`

## Files, folders and permissions
- `file` 'file hello.txt' determines file type
- `stat` gives stat of file
- `ls -R` list of folders with recursive option. Shows folder/sub-folder/sub-sub.. eg `ls -R folder-name/`
- `cd -` takes you back to the previously used folder
- `cd` to change directory
- `cd ~` or `cd` go to root
- `cd..` go to parent directory of current directory
- `cd ../../name-of-folder`
- `pwd`

###ls
- `ls -lh` long listing of files with size in human readable
- `ls` list of files
- `ls -l` long listing

### Create and remove folders
`mkdir new-folder` or `mkdir path-where-you-want-folder-to-be-created/folder-name` space seperate folders for creating multiple folders
`mkdir -p folder1/folder2/folder2` creates parent folder if missing in path you gave  
- `rmdir` - folder has to be empty for it to be removed like this

### Copy, move and delete files and folders
- `cp my-file.txt copy-my-file-txt`
- `cp my-file.txt path/where/i/want/my-file.txt/to/be/be/copied`
- `mv` for move or renaming. Similar to `cp`
- `mv path/where/my-file.txt/is .` moves file from some folder to current folder.
- `mv *.txt path/where/you/want/these/files/to/be/moved` - moves all txt files
- `mv /path/where/ALL/files/are/* .` moves *ALL* files from a folder to current working folder
- `rm my-file.txt` removes my-files.txt
- `rm my-file?.txt` removes my-file1.txt and my-file2.txt, but not my-file.txt
- `rm -r path/of/directory/which/you/want/to/delete` removes recursively. Removes folders which are not empty as well and files inside it

### Find
- `find . -name "abc*"`
	- `.` scope where you want to find. We are looking inside curent folder here  
	- `-name` how do you want to find. We are looking for file or foldername here  
	- `"abc*"` what are you finding. We are looking for file/s or folder/s whose name starts with 'abc' here

### User roles and sudo
- When you do something via `sudo` permission stays for few minutes. It is a good idea to give up permisson (`sudo -k`) after you are done with whatever you were doing

- `sudo -s` I want to do everything via `sudo`
 	- End of the prompt changes from `$` to `#` to indicate that
 	- `exit` to switch back to user

### File permissions
- Octal file permissions

0  | Read (4)  | Write (2)  | Execute (1)   | Result
|:-------------: | :-------------:| :-------------:| :-------------:| :-------------:|
User  | r  | w  | x  | 7
  | r  | w  | -  | 6
Group  | r  | -  | x  | 5
Others  | r  | -  | -  | 4
 | -  | w  | x  | 3
 | -  | w  | -  | 2
 | -  | -  | x  | 1
 | -  | -  | -  | 0
 
 - Symbolic file permissions
 
 0 | Read (r) | Write (w) | Execute (x) | Result
|:---:|:---:|:---:|:---:|:---:|
User (u) | + | + | + | u+rwx
Group (g) | = | - | - | g=r
Others (o) | - | - | - | o-rwx
All (a) | |

- `+` adds permission
- `-` removes permission
- `=` adds permissions but removes others
