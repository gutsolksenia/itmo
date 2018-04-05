int a,b;

int main() {
    scanf("%d %d", a,b);
    if (a > b)
    {
        printf("%s\n", "a > b");
    }
    if (a <= b)
    {
        printf("%s\n", "a <= b");
    }
    if (a == b)
    {
        printf("%s\n", "a = b");
    }
    if (a-b < 0)
    {
        printf("%s\n", "a - b < 0");
    } else
    {
        printf("%s\n", "a - b >= 0");
    }
    return 0;
}