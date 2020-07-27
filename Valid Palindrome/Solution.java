class Solution {
   public boolean isPalindrome(String s) {
	if(s == null) return false;
	if(s.isEmpty()) return true;

	s = s.toLowerCase();
	int i = 0;
	int j = s.length() - 1;

	while(i <= j) {
		if(isValid(s.charAt(i)) && isValid(s.charAt(j))) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		} else if(!isValid(s.charAt(i))) {
			i++;
		} else {
			j--;
		}
	}
	return true;
}

private boolean isValid(char c) {
	return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
}
}
