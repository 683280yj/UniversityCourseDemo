using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using test.Model;
using Test.DAL;

namespace Test.BLL
{
    public class TestService
    {
        UserInfoDal userInfoDal = new UserInfoDal();

        public List<UserInfo> GetEntityList() {
            return userInfoDal.GetEntityList();
        }
    }
}
