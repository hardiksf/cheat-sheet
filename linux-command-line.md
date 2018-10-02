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