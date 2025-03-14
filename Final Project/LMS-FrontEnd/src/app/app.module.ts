import { NgModule } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { RegistrationsuccessComponent } from './components/registrationsuccess/registrationsuccess.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { AddprofessorComponent } from './components/addprofessor/addprofessor.component';
import { WelcomepageComponent } from './components/welcomepage/welcomepage.component';
import {UserdashboardComponent} from './components/userdashboard/userdashboard.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import {UserlistComponent} from './components/userlist/userlist.component';
import {ProfessorlistComponent} from './components/professorlist/professorlist.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import {ProfessordashboardComponent} from './components/professordashboard/professordashboard.component';
import {ProfessorprofileComponent} from './components/professorprofile/professorprofile.component';
import {AdmindashboardComponent} from './components/admindashboard/admindashboard.component';
import {ApprovalstatusComponent} from './components/approvalstatus/approvalstatus.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    RegistrationsuccessComponent,
    HeaderComponent,
    FooterComponent,
    AddprofessorComponent,
    WelcomepageComponent,
    UserdashboardComponent,
    UserprofileComponent ,
    UserlistComponent,
    ProfessorlistComponent,
    ProfessordashboardComponent,
    ProfessorprofileComponent,
    AdmindashboardComponent,
    ApprovalstatusComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    NoopAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
