#include<bits/stdc++.h>
#define ll   long long int
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        vector<int> arryy(n + 2, 1);

        for (int i = 1; i <= n; i++)
        {
            cin >> arryy[i];
        }

        int i = 1, cc = 1;

        while (i <= n)
        {
            if (cc)
            {
                arryy[i] = arryy[i + 1] * 2;
                i += 2;
            }
            else
            {
                arryy[i] = arryy[i - 1] * 2;
                i++;
            }

            cc = 1 - cc;
        }

        for (int i = 1; i <= n; i++)
        {
            cout << arryy[i] << " ";
        }

        cout<<endl;
    }
}
