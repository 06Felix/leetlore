## Idea

- Mark broken letters in a 26-entry boolean array. Split the text into words, skip a word upon finding any broken letter, and count the remaining words.

## Why It Works

- A word is fully typeable exactly when every character uses a working key. The labeled continue rejects precisely the words violating that condition.

## Edge Cases

- No broken letters counts every word; repeated broken characters reject the word only once.

## Complexity

- O(text length+brokenLetters length) time and O(text length) space for split strings and character arrays.
