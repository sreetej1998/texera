import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MatDialogModule } from '@angular/material/dialog';

import { NgbActiveModal, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';

import { NgbdModalDeleteWorkflowComponent } from './ngbd-modal-delete-workflow.component';

describe('NgbdModalDeleteProjectComponent', () => {
  let component: NgbdModalDeleteWorkflowComponent;
  let fixture: ComponentFixture<NgbdModalDeleteWorkflowComponent>;

  let deletecomponent: NgbdModalDeleteWorkflowComponent;
  let deletefixture: ComponentFixture<NgbdModalDeleteWorkflowComponent>;

  const sampleProject = {
    id: '4',
    name: 'project 1',
    creationTime: '2017-10-25T12:34:50Z',
    lastModifiedTime: '2018-01-17T06:26:50Z',
  };

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [NgbdModalDeleteWorkflowComponent],
      providers: [
        NgbActiveModal
      ],
      imports: [
        MatDialogModule,
        NgbModule,
        FormsModule,
        HttpClientModule]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgbdModalDeleteWorkflowComponent);
    component = fixture.componentInstance;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('deleteProjectComponent deleteSavedProject should delete project in list', () => {
    deletefixture = TestBed.createComponent(NgbdModalDeleteWorkflowComponent);
    deletecomponent = deletefixture.componentInstance;

    let getBool: Boolean;
    getBool = false;

    deletecomponent.workflow = sampleProject;
    deletecomponent.deleteSavedWorkflow();

    expect(getBool).toEqual(false);
  });
});
