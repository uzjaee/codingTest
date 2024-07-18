def strfry(s1, s2):
    arr = [0] * 26
    for c in s1:
        j = ord(c) - 97
        arr[j] = 1
    for c in s2:
        j = ord(c) - 97
        if arr[j] != 1:
            return "Impossible"
    return "Possible"

if __name__ == "__main__":
    N = int(input())
    results = []

    for _ in range(N):
        s1, s2 = input().split()
        results.append(strfry(s1, s2))

    print("\n".join(results))
