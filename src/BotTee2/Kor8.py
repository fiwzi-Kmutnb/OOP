import matplotlib.pyplot as plt
import matplotlib.patches as patches

def is_point_in_rectangle(x1, y1, m, n, x0, y0):
    x2 = x1 + m
    y2 = y1 + n
    if x1 <= x0 <= x2 and y1 <= y0 <= y2:
        return "Yes"
    else:
        return "No"

x1, y1 = map(float, input().split())
m, n = map(float, input().split())
x0, y0 = map(float, input().split())

result = is_point_in_rectangle(x1, y1, m, n, x0, y0)
print(result)

fig, ax = plt.subplots()

rect = patches.Rectangle((x1, y1), m, n, linewidth=1, edgecolor='r', facecolor='none')

ax.add_patch(rect)

ax.plot(x0, y0, 'bo')

ax.set_xlim([x1 - 10, x1 + m + 10])
ax.set_ylim([y1 - 10, y1 + n + 10])

plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Rectangle and Point')
plt.grid(True)
plt.gca().set_aspect('equal', adjustable='box')
plt.show()
