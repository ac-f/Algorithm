function fib(num) {
	let arr = [1, 1];
	for (let i = 2; i < num; i++) {
		arr.push(arr[i - 1] + arr[i - 2]);
	}
	return arr;
}

console.log(fib(9));
