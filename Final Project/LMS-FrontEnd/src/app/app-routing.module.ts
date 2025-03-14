import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddprofessorComponent } from './components/addprofessor/addprofessor.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { RegistrationsuccessComponent } from './components/registrationsuccess/registrationsuccess.component';
import { WelcomepageComponent } from './components/welcomepage/welcomepage.component';
import { AdminGuard } from './guards/admin.guard';
import {UserdashboardComponent} from './components/userdashboard/userdashboard.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import {UserlistComponent} from './components/userlist/userlist.component';
import {ProfessorlistComponent} from './components/professorlist/professorlist.component';
import {ProfessordashboardComponent} from './components/professordashboard/professordashboard.component';
import {ProfessorprofileComponent} from './components/professorprofile/professorprofile.component';
import {AdmindashboardComponent} from './components/admindashboard/admindashboard.component';
import {ApprovalstatusComponent} from './components/approvalstatus/approvalstatus.component';

const routes: Routes = [
  {path:'',component:WelcomepageComponent},
  {path:'home',component:WelcomepageComponent},
  {path:'login',component:LoginComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'registrationsuccess',component:RegistrationsuccessComponent},
  {path:'addProfessor',component:AddprofessorComponent,canActivate:[AdminGuard]},
  {path:'userdashboard',component:UserdashboardComponent},
  {path:'edituserprofile',component:UserprofileComponent},
  {path:'userlist',component:UserlistComponent},
  {path:'professorlist',component:ProfessorlistComponent},
  {path:'professordashboard',component:ProfessordashboardComponent},
  {path:'editprofessorprofile',component:ProfessorprofileComponent},
  {path:'admindashboard', component:AdmindashboardComponent},
  {path:'approveprofessor',component:ApprovalstatusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
