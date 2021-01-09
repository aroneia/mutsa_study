def solution(array, commands):
    answer = []

    for d in commands:  # d[0] ~ d[1] / d[2]번쩨
        tmp = array[d[0] - 1:d[1]]
        tmp.sort()
        answer.append(tmp[d[2] - 1])

    return answer