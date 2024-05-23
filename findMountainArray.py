def findPeak(arr):
        s = 0
        e = len(arr)-1

        while s < e:
            mid = s + (e-s)//2

            if arr[mid] > arr[mid-1]:
                s = mid+1
            else:
                e = mid-1
        return s
    
def binarySearch(arr, target, s, e):
    while s < e:
        mid = s + (e-s)//2

        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            e = mid-1
        else:
            s = mid+1
    
    return -1

arr = [1,2,3,4,5,3,1]
target = 3

peak_index = findPeak(arr)

left_search = binarySearch(arr, target, 0, peak_index)
if left_search != -1:
    print(left_search)
right_search = binarySearch(arr, target, peak_index+1, len(arr)-1)

print(right_search)