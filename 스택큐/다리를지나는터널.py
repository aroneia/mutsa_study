def solution(bridge_length, weight, truck_weights):
    answer = 0
    ing = [0] * bridge_length

    while len(ing) != 0:
        answer += 1
        ing.pop(0)
        if truck_weights:
            if sum(ing) + truck_weights[0] <= weight:
                ing.append(truck_weights.pop(0))
            else:
                ing.append(0)

    return answer

# [0,0] > [0,7] > [7,0] > [0,0] > [0,4] 이런식으로 밀면서 시간이 흐름.