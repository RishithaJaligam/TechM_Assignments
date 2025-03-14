import { Component, OnInit } from '@angular/core';
import { Router,RouterLink } from '@angular/router';
import { Observable } from 'rxjs';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css'],
})
export class UserdashboardComponent implements OnInit {
  dashboardItems = [
    {
      title: 'Courses',
      description: 'View and access your enrolled courses',
      icon: 'book',
      route: '/courses',
      color: '#4285F4',
    },
    {
      title: 'Assessment & Feedback',
      description: 'Check your assessments and instructor feedback',
      icon: 'assignment',
      route: '/assessments',
      color: '#34A853',
    },
    {
      title: 'Learning Dashboard',
      description: 'Track your progress and performance',
      icon: 'dashboard',
      route: '/learning-dashboard',
      color: '#FBBC05',
    },
    {
      title: 'Logout',
      description: 'Sign out from your account',
      icon: 'logout',
      route: '/login',
      color: '#EA4335',
      isLogout: true,
    },
  ];
  
  // navigateTo(item: any): void {
  //   if (item.isLogout) {
  //     // Handle logout logic
  //     localStorage.removeItem('auth_token');
  //     // this.router.navigate(['/login']);
  //   } else {
  //     this.router.navigate([item.route]);
  //   }
  // }
  navigateTo(item: any) {
    if (item.isLogout) {
      // Perform logout logic here if needed
      localStorage.removeItem('auth_token'); // Example: Clearing local storage
      sessionStorage.clear(); // Example: Clearing session storage
    }
    this.router.navigate([item.route]);
  }

  loggedUser = '';
  currRole = '';
  courses: Observable<any[]> | undefined;
  enrollments: Observable<any[]> | undefined;
  enrollmentcount: Observable<any[]> | undefined;
  wishlist: Observable<any[]> | undefined;
  chapters: Observable<any[]> | undefined;

  constructor(private _service: AdminService, private router: Router) {}

  ngOnInit(): void {
    this.loggedUser = JSON.stringify(
      sessionStorage.getItem('loggedUser') || '{}'
    );
    this.loggedUser = this.loggedUser.replace(/"/g, '');

    this.currRole = JSON.stringify(sessionStorage.getItem('ROLE') || '{}');
    this.currRole = this.currRole.replace(/"/g, '');

    $('#btn').click(function () {
      $('.sidebar').toggleClass('open');
      menuBtnChange();
    });

    $('.bx-search').click(function () {
      $('.sidebar').toggleClass('open');
      menuBtnChange();
    });

    function menuBtnChange() {
      if ($('.sidebar').hasClass('open')) {
        $('#btn').removeClass('fa-bars').addClass('fa-ellipsis-v');
      } else {
        $('#btn').removeClass('fa-ellipsis-v').addClass('fa-bars');
      }
    }

    this.courses = this._service.getTotalCourses();
    this.enrollments = this._service.getTotalEnrollments();
    this.enrollmentcount = this._service.getTotalEnrollmentCount();
    this.wishlist = this._service.getTotalWishlist();
    this.chapters = this._service.getTotalChapters();
  }
}
