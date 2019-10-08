using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace FrmDangNhap
{
    public partial class Form1 : Form
    {
        QL_NguoiDung CauHinh = new QL_NguoiDung();
        public Form1()
        {
            InitializeComponent();
            
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(txtUsername.Text.Trim()))
            {
                MessageBox.Show("Không  được  bỏ  trống" + lblUsername.Text.ToLower());
                this.txtUsername.Focus();
                return;
            }
            if (string.IsNullOrEmpty(this.txtPassword.Text))
            {
                MessageBox.Show("Không  được  bỏ  trống" + lblPassword.Text.ToLower());
                this.txtPassword.Focus();
                return;
            }
            if (CauHinh.Check_Config() == 0)
            {
                ProcessLogin();//  Cấu  hình  phù  hợp  xử  lý  đăng  nhập
            }
            if (CauHinh.Check_Config() == 1)
            {
                MessageBox.Show("Chuỗi  cấu  hình  không  tồn  tại");//  Xử  lý  cấu  hình
                ProcessLogin();
            }
            if (CauHinh.Check_Config() == 2)
            {
                MessageBox.Show("Chuỗi  cấu  hình  không  phù  hợp");//  Xử  lý  cấu  hình
                ProcessLogin();
            }

        }
        public void ProcessLogin()
        {
            int result = CauHinh.Check_User(txtUsername.Text, txtPassword.Text);
            //  Wrong  username  or  pass
            if (result == 100)
            {
                MessageBox.Show("Sai  " + lblUsername.Text + "  Hoặc  " + lblPassword.Text);
                return;
            }
            //  Account  had  been  disabled
            else if (result == 200)
            {
                MessageBox.Show("Tài  khoản  bị  khóa");
                return;
            }

            if (Program.mainForm == null || Program.mainForm.IsDisposed)
            {
                Program.mainForm = new frmMain();
            }
            this.Visible = false;
            Program.mainForm.Show();
        }

        
        }
 }       
