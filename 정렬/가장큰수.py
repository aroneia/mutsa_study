
def solution(numbers):
    numbers = list(map(str, numbers))

    numbers.sort(key = lambda x: x* 3, reverse=True)
    return str(int(''.join(numbers)))

    return answer

# 문자열은 국어사전 순처럼 정렬**
# numbers의 원소는 0 이상 1,000 이하 >> 라는 조건 덕분에 x*3의 상태로 비교하면 되는 것.
# 즉, "666"이 "101010"보다 크다고 할 수 있는 것.
