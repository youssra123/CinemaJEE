import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjouterFilmsComponent } from './ajouter-films.component';

describe('AjouterFilmsComponent', () => {
  let component: AjouterFilmsComponent;
  let fixture: ComponentFixture<AjouterFilmsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjouterFilmsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjouterFilmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
